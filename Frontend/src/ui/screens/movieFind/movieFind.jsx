import './movieFind.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faTimes, faHeart } from "@fortawesome/free-solid-svg-icons";
import { useState } from "react";
import { useHistory } from "react-router-dom";
import { useUserGlobal } from "../../../context";
import { AppHeader, AppFooterViewer } from "../../components/index";


export function MovieFind() {
    return (
        <div className="moviePage">
            <AppHeader />
            <div class="movieArea">
                <div class="moviePhoto">
                    <img src="https://www.uphe.com/sites/default/files/styles/scale__344w_/public/2021/03/shrek_20_posterart.png" title="moviePhoto" alt="Movie Photo" />
                    <div class="movieName">Shrek Dois, <span class="director">Vicky Jenson</span></div>
                    <div class="tinfo">i</div>
                </div>
                <div class="userControls">
                    <div class="userNo"><div className="icon"><FontAwesomeIcon icon={faTimes}/></div></div>
                    <div class="controlUnion"/>
                    <div class="userYes"><div className="icon"><FontAwesomeIcon icon={faHeart}/></div></div>
                </div>
            </div>
            <AppFooterViewer />
        </div>
    );
}
