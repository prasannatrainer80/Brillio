const Post = ({ posts, loading }) => {
    if (loading) {
        return (
            <h1>Loading.....</h1>
        )
    }
    return (
        <>
            <table border="3" align="center">
                <tr>
                    <th>Employ No</th>
                    <th>Employ Name</th>
                    <th>Gender</th>
                    <th>Department</th>
                    <th>Designation</th>
                    <th>Basic</th>
                </tr>
            {posts.map((data, index) => (
                <tr>
                        <td>{data.empno}</td>
                        <td>{data.name}</td>
                        <td>{data.gender}</td>
                        <td>{data.dept}</td>
                        <td>{data.desig}</td>
                        <td>{data.basic}</td>
                  
              
                </tr>
            ))}
            </table>
        </>
    )
}

export default Post