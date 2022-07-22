import React from "react";
import TransactionService from "../services/TransactionService";

class TransactionComponent extends React.Component{

    constructor(props){
        super(props)
        this.state = {
            transactions:[]
        }
    }
    componentDidMount(){
        TransactionService.getTransactions().then((response) =>{
            this.setState({transactions : response.data})

        });
    }
    render(){
        return(
            <div class="col main pt-5 mt-3">
                <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Home</a></li>
            <li class="breadcrumb-item active" aria-current="page">Data</li>
        </ol>
        </nav>
        <p class="lead d-none d-sm-block">Transaction Details and Records</p>
 
        <div class="alert alert-warning fade collapse" role="alert" id="myAlert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">×</span>
                <span class="sr-only">Close</span>
            </button>
            <strong>Data and Records</strong> Learn more about employee
        </div>
        <div class="row mb-3">
            <div class="col-xl-3 col-sm-6 py-2">
                <div class="card bg-success text-white h-100">
                    <div class="card-body bg-success" style={{backgroundColor:"#57b960"}}>
                        <div class="rotate">
                            <i class="fa fa-user fa-4x"></i>
                        </div>
                        <h6 class="text-uppercase">TRANSACTIONS</h6>
                        <h1 class="display-4">6</h1>
                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-sm-6 py-2">
                <div class="card text-white bg-danger h-100">
                    <div class="card-body bg-danger">
                        <div class="rotate">
                            <i class="fa fa-list fa-4x"></i>
                        </div>
                        <h6 class="text-uppercase">Debit</h6>
                        <h1 class="display-4">4</h1>
                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-sm-6 py-2">
                <div class="card text-white bg-info h-100">
                    <div class="card-body bg-info">
                        <div class="rotate">
                          <i class="fab fa-twitter fa-4x"></i>
                        </div>
                        <h6 class="text-uppercase">Credit</h6>
                        <h1 class="display-4">2</h1>
                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-sm-6 py-2">
                <div class="card text-white bg-warning h-100">
                    <div class="card-body">
                        <div class="rotate">
                            <i class="fa fa-share fa-4x"></i>
                        </div>
                        <h6 class="text-uppercase">Merchants</h6>
                        <h1 class="display-4">4</h1>
                    </div>
                </div>
            </div>
        </div>
 
        <hr/>
                <h1 className="text-center">Transactions List</h1>
                <table className="table table-stripped table-secondary">
                    <thead className="table-dark">
                        <tr>
                            <td>Id</td>
                         
                            <td>Amount</td>
                            <td>Merchant Name</td>
                            <td>Type</td>

                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.transactions.map(
                                transaction =>
                                <tr key = {transaction.id}>
                                    <td>{transaction.id}</td>
                                    <td>{transaction.amount}</td>   
                                    <td>{transaction.merchantName}</td>
                                    <td>{transaction.type}</td>


                                </tr>
                            )
                        }
                    </tbody>

                </table>
            </div>
        )
    }

}
export default TransactionComponent