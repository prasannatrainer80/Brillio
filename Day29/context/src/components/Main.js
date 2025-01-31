// import { createContext, useState } from "react"
// // import { GlobalData } from "../context/GlobalData"
// import Child from "./Child1"

// export const GlobalData = createContext()

// const Main = () => {
//     const[name,setName] = useState("hello")
//     return(
//         <GlobalData.Provider value={{name, setName}}>
//             <span>Parent Component</span> <br/>
//             <button onClick={() => setName("Test Data")}>
//                 Click Me
//             </button>
//             <Child />
//         </GlobalData.Provider>
//     )
// }

// export default Main