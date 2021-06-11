import './movieUpload.css';
import { useState } from "react";
import { useHistory } from "react-router-dom";
import { useUserGlobal } from "../../../context";
import { AppHeader, AppFooterDirector } from "../../components/index";


export function MovieUpload() {
    return (
        <div className="movieUpload">
            <form class="box">
                <AppHeader/>
                <h1>Informações do Filme</h1>
                <input type="text" name="" placeholder="Nome do Filme" />
                <input type="text" name="" placeholder="Descrição" />
                <input type="text" name="" placeholder="Insira a URL da imagem" />
                <input type="submit" name="" value="Submit" />
                <AppFooterDirector />
            </form>
        </div>
    );
}
