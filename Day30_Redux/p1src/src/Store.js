import { createStore } from "@reduxjs/toolkit";
import NamesReducer from "./NamesReducer";

const Store = createStore(NamesReducer)

export default Store;