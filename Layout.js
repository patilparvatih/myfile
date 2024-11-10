import {Outlet,Link} from 'react-router-dom';
function Layout(){
    return(
    <>
    <nav>
        <ul>
            <li>
                <Link to="/">Home</Link>
            </li>
            <li>
                <Link to="/Blogs">Blogs</Link>
            </li>
            <li>
                <Link to="/Contacts">Contacts</Link>
            </li>
        </ul>
    </nav>
    <Outlet/>     
    </>
    );
}
export default Layout;

