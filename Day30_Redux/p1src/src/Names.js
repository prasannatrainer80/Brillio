import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { anoop,mahitha,soniya } from './NamesReducer';

const Names = () => {
 // Access the count value from the Redux store
 const sname = useSelector((state) => state.sname);
 // Get the dispatch function from Redux
 const dispatch = useDispatch();

 return (
    <div>
        <h1>Student Name: {sname}</h1>
        <button onClick={() => dispatch(anoop())}>Anoop</button>
        <button onClick={() => dispatch(mahitha())}>Mahitha</button>
        <button onClick={() => dispatch(soniya())}>Soniya</button>
        
    </div>
);
}

export default Names;