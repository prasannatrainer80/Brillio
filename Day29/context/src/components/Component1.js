import { useContext } from "react"
import { ColorContext } from "../context/ColorContext"

const Component1 = () => {
    const theme = useContext(ColorContext)

    return(
        <button style={{backgroundColor:theme.background,color: theme.text}}>Hello</button>
    );
}

export default Component1;