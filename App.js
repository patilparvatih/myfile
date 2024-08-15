/*
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
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
*/
/*
import Task from "./Task";
// import ReactDOM from 'react-dom/client';
function App(){
  return(
    <div>
      <Task text="Plus" completed={false} />
      <Task text="Minus" completed={true} />
      <Task text="Multiply" completed={false} />
      <Task text="Division" completed={true} />
    </div>
  );
}
*/

/*
import React,{Component} from 'react';
class counter extends Component{
  constructor(){
    super();
    this.state={
      no:1
    };
  }
  increment=()=>{
    this.setState({no:this.state.no+1});
  }
  decrement=()=>{
    this.setState({no:this.state.no-1});
  }
  render(){
    return(
    <div>
      <h1>Value={this.state.no}</h1>
      <button onClick={this.increment}>Increment</button>
      <button onClick={this.decrement}>Decrement</button>
    </div>
    );
  }
}
export default counter;
*/

import ReactDom from 'react-dom/client';
import {BrowserRouter,Routes,Route} from 'react-router-dom';
import Home from './component/Home';
import Nopage from './component/Nopage';
import Blogs from './component/Blogs';
import Contacts from './component/Contacts';
import Layout from './component/Layout';

export default function App(){
  return(
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout/>}>
        <Route index element={<Home/>} />
        <Route path="Blogs" element={<Blogs/>} />
        <Route path="Contacts" element={<Contacts/>} />
        <Route path="*" element={<Nopage/>} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}
const rt=ReactDom.createRoot(document.getElementById('root'));
