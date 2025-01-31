import { useContext } from "react";
import { ThemeContext } from "../context/ThemeContext";

const Button = () => {
    const theme = useContext(ThemeContext);

  return (
    <button style={{backgroundColor:theme.background,color: theme.text}}>Hello</button>
  );

}

export default Button;