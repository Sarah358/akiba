// adding http axios library to make rest api call
import axios from "axios";

const TRANSACTIONS_REST_API_URL = 'http://localhost:8080/api/v1/transactions/35867408';

class TransactionService{
    getTransactions(){
        return axios.get(TRANSACTIONS_REST_API_URL);
    }
}
export default new TransactionService();