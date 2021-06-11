import './movieList.css';
import { useState } from "react";
import { useHistory } from "react-router-dom";
import { useUserGlobal } from "../../../context";
import { AppHeader, AppFooterViewer } from "../../components/index";


export function MovieList() {
    return (
        <div className="movieList">
            <AppHeader />
            <h1>Filmes Curtidos</h1>
            <div class="list">
                    <div class="listItem">
                        <span class="focus">Shrek 2</span> por <span class="focus">Vicky Jenson</span>
                    </div>
            </div>
            <AppFooterViewer />
        </div>
    );
}
