import logo from './logo.svg';
import './App.css';
import Button from './components/Button';
import Component1 from './components/Component1';
import Example1 from './components/Example1';
import Calc from './components/Calc';

function App() {
  return (
    <div className="App">
      {/* <Button /> */}
      <Component1 /> <br/>
      <Example1 /> <br/> <hr/>
      <Calc />
    </div>
  );
}

export default App;
