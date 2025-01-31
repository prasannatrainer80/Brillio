import { useContext } from "react"
import { UserContext } from "../context/UserContext"

const Example2 = () => {
    const user = useContext(UserContext)
    return(
        <p>
            User Name : <b> {user.userName}</b> <br/>
            Company : <b>{user.company} </b> <br/>
            Topic : <b>{user.topic}</b>
        </p>
    )
}

export default Example2;