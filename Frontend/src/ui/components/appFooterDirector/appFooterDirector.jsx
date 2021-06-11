import "./appFooterDirector.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faList, faHome } from "@fortawesome/free-solid-svg-icons";
import logo from "../../../assets/images/MovieBoxLogo.png";

export function AppFooterDirector(){

    return(
        <div class="footer">
                <a class="upload" href="/director/upload"><FontAwesomeIcon icon={faHome}/></a>
                <a class="companion" href="/director/companion"><FontAwesomeIcon icon={faList}/></a>
                <div class="logo">
                    <img src={logo} alt="MovieBox Logo" title="MovieBox Logo" />
                </div>
            </div>
    )
}