import React from 'react'

const EmployeeTable = () => {
  return (
    <div className="container mx-40 p-4">
      <div>
        <button className="bg-purple-600 hover:bg-purple-800 text-white font-bold py-2 px-8 rounded my-20">Add Employee</button>
      </div>
      <div>
        <table className="shadow">
          <thead className="bg-slate-700 text-white">
            <th className="px-6 py-3 uppercase tracking-wide">Name</th>
            <th className="px-6 py-3 uppercase tracking-wide">Email</th>
            <th className="px-6 py-3 uppercase tracking-wide">Position</th>
            <th className="px-6 py-3 uppercase tracking-wide">Actions</th>
          </thead>
          <tbody>
          <tr className="hover:bg-slate-200 hover:text-slate-900">
            <td className="px-6 py-4 whitespace-nowrap">Shruti</td>
            <td className="px-6 py-4 whitespace-nowrap">shruti@example.com</td>
            <td className="px-6 py-4 whitespace-nowrap">Software Engineer</td>
            <td className="px-6 py-4 whitespace-nowrap">
              <button className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-1 px-4 rounded">Edit</button>
              <button className="bg-red-500 hover:bg-red-700 text-white font-bold py-1 px-4 rounded ml-2">Delete</button>
            </td>
          </tr>
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default EmployeeTable