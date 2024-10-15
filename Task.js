function Task=(props)=>{
    return(
        <div>
            <input type="checkbox" defaultChecked={props.checked}/>
            <span>{props.text}</span>
        </div>
    );
}
export default Task;
