const initialState = {
    sname : ''
}

const NamesReducer = (state = initialState, action) => {
    switch (action.type) {
        case 'ANOOP':
            return { ...state, sname: 'Hi I am Anoop' };
        case 'SONIYA':
            return { ...state, sname: 'Hi I am Soniya' };
        case 'MAHITHA':
                return { ...state, sname: 'Hi I am Mahitha' };
    
        default:
            return state;
    }
}
export const anoop = () => ({ type: 'ANOOP' });
export const soniya = () => ({ type: 'SONIYA' });
export const mahitha = () => ({type : 'MAHITHA'});

export default NamesReducer;

