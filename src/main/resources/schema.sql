CREATE TABLE proveedor(
    id INT PRIMARY KEY,
    nombre  VARCHAR(255)
);

CREATE TABLE destino(
    id INT PRIMARY KEY,
    nombre VARCHAR(255)
);

CREATE TABLE producto (
    id INT,
    id_ean VARCHAR(13),
    nombre VARCHAR(255),
    proveedor_id INT,
    destino_id INT,
    PRIMARY KEY(id_ean),
    FOREIGN KEY (proveedor_id) REFERENCES proveedor(id),
    FOREIGN KEY (destino_id) REFERENCES destino(id)
);