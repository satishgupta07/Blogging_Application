import axios from "axios";

const URL = 'http://localhost:9090';

export const registerUser = async (data) => {
    try {
        console.log(data);
        return await axios.post(`${URL}/api/v1/auth/register`, data);
    } catch (error) {
        console.log('Error while calling signup api ', error);
        return error.response;
    }
}

export const authenticateLogin = async (data) => {
    try {
        return await axios.post(`${URL}/api/v1/auth/login`, data);
    } catch (error) {
        console.log('Error while calling login api ', error);
        return error.response;
    }
}