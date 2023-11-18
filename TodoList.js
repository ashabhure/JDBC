import React from 'react'
import { useState } from 'react'
function TodoList() {
const[activity,setActivity]=useState("")
    return (
      <>
      <div className='container'>
      <div className='header'>ToDo List</div>
     <input type='text' placeholder='Add Activity' value={activity} onChange={(e)=> setActivity(e.target.value)}/>
      </div>
     
    </>
    )
  }
export default TodoList
