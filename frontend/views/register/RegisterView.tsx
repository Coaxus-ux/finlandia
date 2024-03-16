import React, { useState } from 'react';
import './RegisterView.css'; // Importa el archivo de estilos CSS

function RegisterView() {
  const [userData, setUserData] = useState({
    userName: '',
    userLastName: '',
    email: '',
    phone: '',
    password: '',
    userStatus: ''
  });

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setUserData(prevState => ({
      ...prevState,
      [name]: value
    }));
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    // Aquí puedes enviar los datos a tu backend o realizar cualquier otra acción necesaria
    console.log(userData);
  };

  return (
    <div className="card"> {/* Clase para estilos de tarjeta */}
      <form onSubmit={handleSubmit} className="form"> {/* Clase para estilos de formulario */}
        <label>
          User Name:
          <input type="text" name="userName" value={userData.userName} onChange={handleChange} />
        </label>
        <label>
          Last Name:
          <input type="text" name="userLastName" value={userData.userLastName} onChange={handleChange} />
        </label>
        <label>
          Email:
          <input type="email" name="email" value={userData.email} onChange={handleChange} />
        </label>
        <label>
          Phone:
          <input type="text" name="phone" value={userData.phone} onChange={handleChange} />
        </label>
        <label>
          Password:
          <input type="password" name="password" value={userData.password} onChange={handleChange} />
        </label>
        <button type="submit">Save</button>
      </form>
    </div>
  );
}

export default RegisterView;
