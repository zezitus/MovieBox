import "./appFooterViewer.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faList, faHome } from "@fortawesome/free-solid-svg-icons";
import logo from "../../../assets/images/MovieBoxLogo.png";

export function AppFooterViewer(){

    return(
        <div class="footer">
                <a class="list" href="/viewer/list"><FontAwesomeIcon icon={faList}/></a>
                <a class="feed" href="/viewer/feed"><FontAwesomeIcon icon={faHome}/></a>
                <div class="logo">
                    <img src={logo} alt="MovieBox Logo" title="MovieBox Logo" />
                </div>
            </div>
    )
}