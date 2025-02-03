import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { increment, decrement } from './CounterReducer';

const Counter = () => {
    // Access the count value from the Redux store
    const count = useSelector((state) => state.count);
    // Get the dispatch function from Redux
    const dispatch = useDispatch();

    return (
        <div>
            <h1>Count: {count}</h1>
            <button onClick={() => dispatch(increment())}>Increment</button>
            <button onClick={() => dispatch(decrement())}>Decrement</button>
        </div>
    );
};

export default Counter;