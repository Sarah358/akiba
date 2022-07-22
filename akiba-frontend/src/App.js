import logo from './logo.svg';
import './App.css';
import TransactionComponent from './components/TransactionComponent';
import Navbar from './components/Navbar';
import Sidebar from './components/Sidebar';

function App() {
  return (
    <div className="App">
      <Navbar />
      <div class="container-fluid" id="main">
      <div class="row row-offcanvas row-offcanvas-left">
      <Sidebar/>
      <TransactionComponent />
 
    </div>
    </div>
    </div>
  );
}

export default App;
