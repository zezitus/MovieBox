import './movieCompanion.css';
import { useState } from "react";
import { useUserGlobal } from "../../../context";
import { AppHeader, AppFooterDirector } from "../../components/index";


export function MovieCompanion() {
    return (
        <div className="movieList">
            <AppHeader />
            <h1>Seus Filmes</h1>
            <div class="list">
                    <div class="listItem">
                        <span class="focus">Shrek 2</span> possui <span class="focus">20</span> curtidas
                    </div>
            </div>
            <AppFooterDirector />
        </div>
    );
}
