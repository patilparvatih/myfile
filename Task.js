/*
const Task=(props)=>{
    return(
        <div>
            <input type="checkbox" defaultChecked={props.checked}/>
            <span>{props.text}</span>
        </div>
    );
}
*/
function pr(){
    let a=document.getElementById("se");
    let v=`your selected language is ${a.value}`;
    alert(v);
}
function Task(){
    return(
        <div>
            <h1>Select Your favorite programing language</h1>
            <select onMouseLeave={pr} id="se">
                <option>Python</option>
                <option>Java</option>
                <option>C++</option>
                <option>JavaScript</option>
            </select>
        </div>
    );
}

export default Task;
