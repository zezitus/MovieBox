import "./appHeader.css";
import logo from "../../../assets/images/MovieBoxLogo.png";

export function AppHeader() {
    return (
        <div class="header">
                <div class="logo">
                    <img src={logo} alt="MovieBox Logo" title="MovieBox Logo" />
                </div>
            </div>
    );
}