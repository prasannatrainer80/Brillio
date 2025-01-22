import logo from './logo.svg';
import './App.css';
import First from './components/first/first';
import Second from './components/second/second';
import Show from './components/show/show';
import ButtonEx from './components/buttonex/buttonex';
import FormEx1 from './components/formex1/formex1';
import Calc from './components/calc/calc';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <p>
          <First />
        </p>
        <p>
          <Second />
        </p>
        <p>
          <Show />
        </p>
        <p>
          <ButtonEx />
        </p>
        <p>
          Welcome to React...Prasanna
        </p>
        <p>
          <FormEx1 />
        </p>
        <p>
          <Calc />
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
