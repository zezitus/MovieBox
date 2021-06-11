import './registerPage.css';
import { useState } from "react";
import { useHistory } from "react-router-dom";
import { useUserGlobal } from "../../../context";
import logo from "../../../assets/images/MovieBoxLogo.png"

export function RegisterPage() {

    return (
        <div class="loginPage">
            <div class="form">
                <img src={logo} alt="MovieBox Logo" title="MovieBox Logo" />
                <form class="registerForm">
                    <input type="text" placeholder="Nome" />
                    <input type="text" placeholder="Sobrenome" />
                    <input type="text" placeholder="E-mail" />
                    <input type="password" placeholder="Senha" />
                    <input type="password" placeholder="Confirmar Senha" />
                    <button>Sign In</button>
                    <p class="message">Já registrado? <a href="/">Logue agora.</a></p>
                </form>
            </div>
        </div>
    );
}