import './loginPage.css';
import { useState } from "react";
import { useHistory } from "react-router-dom";
import { useUserGlobal } from "../../../context";
import logo from "../../../assets/images/MovieBoxLogo.png"

export function LoginPage() {

    return (
        <div class="loginPage">
            <div class="form">
            <img src={logo} alt="MovieBox Logo" title="MovieBox Logo"/>
                <form class="loginForm">
                    <input type="text" placeholder="Usuário" />
                    <input type="password" placeholder="Senha" />
                    <button>Log In</button>
                    <p class="message">Não registrado? <a href="/register">Crie uma conta.</a></p>
                </form>
            </div>
        </div>
    );
}
