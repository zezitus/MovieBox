import './App.css';
import { Switch, Route, Redirect } from "react-router-dom";
import { useUserGlobal } from "./context";
import {
  LoginPage,
  RegisterPage,
  MovieFind,
  MovieList,
  MovieUpload,
  MovieCompanion,
} from "./ui/screens";

function PrivateRoute({ path, char, children }) {
  const [user] = useUserGlobal()

  if (!user.token) {
    return <Redirect to="/" />
  }

  return (
    <Route path={path} exact>
      {children}
    </Route>
  )
}

function App() {
  return (
    <div className="App">
      <Switch>
        <Route path="/" exact>
          <LoginPage />
        </Route>
        <Route path="/register" exact>
          <RegisterPage />
        </Route>
        <Route path="/viewer/feed" exact>
          <MovieFind />
        </Route>
        <Route path="/viewer/list" exact>
          <MovieList />
        </Route>
        <Route path="/director/upload" exact>
          <MovieUpload />
        </Route>
        <Route path="/director/companion" exact>
          <MovieCompanion />
        </Route>
      </Switch>
    </div>
  );
}

export default App;
