import React from 'react'

const NavBar = () => {
  return (
    <div className="bg-slate-900 flex h-16 px-10 items-center">
      <h1 className="text-4xl font-bold text-purple-600">EM APP</h1>
      <div className="bg-slate-700 space-x-4 ml-auto px-4 py-2 rounded">
        <a href="/home" className="hover:text-pink-700">Home</a>
        <a href="/profile " className="hover:text-pink-700">Profile</a>
        <a href="/logout" className="hover:text-pink-700">Logout</a>
      </div>
    </div>
  )
}

export default NavBar