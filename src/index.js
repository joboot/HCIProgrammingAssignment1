import React from 'react'
import ReactDOM from 'react-dom/client'
import './index.css'

  function Square(props){
    //This adds the css property of winning-square onto the square if it is a winning square. Be sure to look at index.css to see the winning-square property I added
    return (
      <button className={'square ' + (props.isWinning ? "winning-square" : null)} onClick={props.onClick}>
        {props.value}
      </button>
    )
  }
  class Board extends React.Component {
    renderSquare(i) {
      //isWinning is a key for whether or not a square is a winning square
      //the .includes is a javascript method that determines whether an array includes a certain value among its entries, returning true or false as appropriate
      return (
        <Square 
          isWinning={this.props.winningSquares.includes(i)}
          key={"square " + i}
          value={this.props.squares[i]}
          onClick={() => this.props.onClick(i)}
          />
      );
    }

    //loops through to create three squares starting with the value passed through
    renderSquares(j) {
      let squares = [];
      
      for (let i = j; i < j + 3; i++) {
        squares.push(this.renderSquare(i));
      }
      return squares;
    }

    //Returns the div for each board row
    renderRow(i) {
      return <div className="board-row">{this.renderSquares(i)}</div>;
    }
    
    //Sets up the rendering of each row
    render() {
      return (
        <div>
        {this.renderRow(0)}
        {this.renderRow(3)}
        {this.renderRow(6)}
        </div>
      );
    }
  }
  
  class Game extends React.Component {
    //Added isDescending for a value for the sort button to look at
    constructor(props){
      super(props)
      this.state = {
        history:[{
          squares: Array(9).fill(null),
        }],
        stepNumber: 0,
        xIsNext: true,
        isDescending: true
      }
    }

    handleClick(i) {
      //Array of locations that the squares can be in (column, row)
      const locations = [
        [1, 1],
        [2, 1],
        [3, 1],
        [1, 2],
        [2, 2],
        [3, 2],
        [1, 3],
        [2, 3],
        [3, 3]
      ];

      const history = this.state.history.slice(0, this.state.stepNumber + 1);
      const current = history[history.length -1];
      const squares = current.squares.slice();

      if(calculateWinner(squares) || squares[i]){
        return;
      }

      squares[i] = this.state.xIsNext ? 'X' : 'O';

      //Had to concat squares and location into the history
      this.setState({
        history: history.concat([{
          squares: squares,
          location: locations[i]
        }]),
        stepNumber: history.length,
        xIsNext: !this.state.xIsNext,
      });
    }

    jumpTo(step){
      this.setState({
        stepNumber: step,
        xIsNext: (step % 2) === 0,
      });
    }

    //function to sort moves either by descending or ascending
    sortMoves() {
      this.setState({
        isDescending: !this.state.isDescending
      });
    }

    render() {
      const history = this.state.history;
      const current = history[this.state.stepNumber];
      const winner = calculateWinner(current.squares);

      //Adds the location onto each description of the move buttons
      const moves = history.map((step, move)=>{
        const desc = move ?
          'Go to move #' + move + " Location: column " + history[move].location[0] + ", row " + history[move].location[1] :
          'Go to game start';

        //Put a <b></b> tag around description to bolden if it is current step, else just no bold
        return (
          <li key={move}>
            <button onClick={() => this.jumpTo(move)}>{move == this.state.stepNumber ? <b>{desc}</b> : desc}</button>
          </li>
        );
      });

      let status;

      if(winner){
        status = 'Winner: ' + winner.player;
      //if no squares are null and there is not winner, its a draw
      } else if (!current.squares.includes(null)) {
        status = "Draw!";
      } else {
        status = 'Next player: ' + (this.state.xIsNext ? 'X': 'O');
      }
      //Added winning squares key to the board
      //Also added the list being able to be sorted by descending or ascending through a button that is utilizing the sortMoves() function
      //The array function moves.reverse just reverses the order of the array, so it easily switches to ascending
      return (
        <div className="game">
          <div className="game-board">
            <Board 
              winningSquares={winner ? winner.line : []}
              squares={current.squares}
              onClick={(i) => this.handleClick(i)}
            />
          </div>
          <div className="game-info">
            <div>{status}</div>
            <ol>{this.state.isDescending ? moves : moves.reverse()}</ol>
            <button onClick={() => this.sortMoves()}>
              Sort by: {this.state.isDescending ? "Descending" : "Asending"}
            </button>
          </div>
        </div>
      )
    }
  }
  
  function calculateWinner(squares){
    const lines =[
      [0,1,2],
      [3,4,5],
      [6,7,8],
      [0,3,6],
      [1,4,7],
      [2,5,8],
      [0,4,8],
      [2,4,6],
    ];

    for (let i = 0; i < lines.length; i++){
      const [a,b,c] = lines[i];
      if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]){
        return {player: squares[a], line: [a, b, c] };;
      }
    }

    return null;
  }
  // ========================================
  
  const root = ReactDOM.createRoot(document.getElementById("root"));
  root.render(<Game />);
  

  
