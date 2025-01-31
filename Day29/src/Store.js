import { createStore } from "redux";
import CounterReduce from "./CounterReducer";

const Store = createStore(CounterReduce)

export default Store;