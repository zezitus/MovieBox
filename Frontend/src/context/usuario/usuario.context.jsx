import createGlobalState from "react-create-global-state"

const stringifyUser = localStorage.getItem("user")

const user = JSON.parse(stringifyUser) || {}

const [useUserGlobal, UserGlobalProvider] = createGlobalState(user)

export { useUserGlobal, UserGlobalProvider }
