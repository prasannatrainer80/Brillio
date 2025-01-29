import React, {useState} from 'react';

const TableComponent = () => {
    const [searchTerm, setSearchTerm] = useState('');

    const data = [ 
         { id: 1, name: 'Rahul Sharma', age: 28, city: 'Mumbai' },
         { id: 2, name: 'Priya Singh', age: 34, city: 'Delhi' },
         { id: 3, name: 'Amit Kumar', age: 45, city: 'Bangalore' },
         { id: 4, name: 'Sneha Roy', age: 22, city: 'Kolkata' },
               ];

    // Filter data based on search term
    const filteredData = data.filter(item => 
        item.name.toLowerCase().includes(searchTerm.toLowerCase()) ||
        item.city.toLowerCase().includes(searchTerm.toLowerCase())
    );

    return (
        <div>
            <input 
                type="text" 
                placeholder="Search by name or city"
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
                className="mb-4 p-2 border border-gray-300 rounded"
            />
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>City</th>
                    </tr>
                </thead>
                <tbody>
                {filteredData.length > 0 ? (
                        filteredData.map(item => (
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.name}</td>
                                <td>{item.age}</td>
                                <td>{item.city}</td>
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

export default TableComponent;