import { createContext } from "react"

export const userData = {
    userName : "Prasanna",
    company : "Brillio",
    topic : "React Training"
}

export const UserContext = createContext(userData)