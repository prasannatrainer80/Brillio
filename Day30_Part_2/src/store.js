// store.js

import { createStore } from 'redux';

const initialState = {
    formData: {}
};

const rootReducer = (state = initialState, action) => {
  
    switch (action.type) {
        case 'SUBMIT_FORM':
            return {
               
                ...state,
                formData: action.payload
            };
        default:
            return state;
    }
};

const store = createStore(rootReducer);

export default store;

export const submitForm = (formData) => {
    return {
        type: 'SUBMIT_FORM',
        payload: formData
    };
};