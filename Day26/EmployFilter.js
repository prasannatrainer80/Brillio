import React, {useEffect, useState} from 'react';

const EmployFilter = () => {
    const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(false);
    const [searchTerm, setSearchTerm] = useState('');

   useEffect(() => {
       const fetchPosts = async () => {
         setLoading(true);
         try {
           const response = await fetch("http://localhost:8282/employ/showEmploy");
           const data = await response.json();
           setPosts(data);
           setLoading(false)
         } catch (error) {
           console.log(error);
         }
       }
       fetchPosts();
     }, [])
   
    // const data = [ 
    //      { id: 1, name: 'Rahul Sharma', age: 28, city: 'Mumbai' },
    //      { id: 2, name: 'Priya Singh', age: 34, city: 'Delhi' },
    //      { id: 3, name: 'Amit Kumar', age: 45, city: 'Bangalore' },
    //      { id: 4, name: 'Sneha Roy', age: 22, city: 'Kolkata' },
    //            ];

    // Filter data based on search term
    const filteredData = posts.filter(item => 
        item.name.toLowerCase().includes(searchTerm.toLowerCase()) ||
        item.gender.toLowerCase().includes(searchTerm.toLowerCase()) ||
        item.dept.toLowerCase().includes(searchTerm.toLowerCase())
    );

    return (
        <div>
            <input 
                type="text" 
                placeholder="Search by name or Gender"
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
                className="mb-4 p-2 border border-gray-300 rounded"
            />
            <table border="1">
                <thead>
                    <tr>
                        <th>Employ No</th>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>Department</th>
                        <th>Designation</th>
                        <th>Basic</th>
                    </tr>
                </thead>
                <tbody>
                {filteredData.length > 0 ? (
                        filteredData.map(item => (
                            <tr key={item.empno}>
                                <td>{item.empno}</td>
                                <td>{item.name}</td>
                                <td>{item.gender}</td>
                                <td>{item.dept}</td>
                                <td>{item.desig}</td>
                                <td>{item.basic}</td>
                            </tr>
                        ))
                    ) : (
                        <tr>
                            <td colSpan="4">No results found</td>
                        </tr>
                    )}
                </tbody>
            </table>
        </div>
    );
};

export default EmployFilter;