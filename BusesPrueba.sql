CREATE TABLE marca_bus (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE bus (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_bus VARCHAR(20) NOT NULL,
    placa VARCHAR(20) NOT NULL UNIQUE,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    caracteristicas TEXT,
    marca_id INT NOT NULL,
    estado ENUM('Activo', 'Inactivo') NOT NULL,
    FOREIGN KEY (marca_id) REFERENCES marca_bus(id)
);

INSERT INTO marca_bus (nombre) VALUES ('Volvo'), ('Scania'), ('Fiat');

INSERT INTO bus (numero_bus, placa, caracteristicas, marca_id, estado) VALUES
('001', 'ABC-123', 'Asientos reclinables, aire acondicionado', 1, 'Activo'),
('002', 'DEF-456', 'Wi-Fi, puertos USB', 2, 'Activo'),
('003', 'GHI-789', 'Asientos básicos, sin aire acondicionado', 3, 'Inactivo'),
('004', 'JKL-101', 'Asientos de cuero, pantalla LED', 1, 'Activo'),
('005', 'MNO-202', 'Aire acondicionado, baño incluido', 2, 'Activo'),
('006', 'PQR-303', 'Wi-Fi, asientos económicos', 3, 'Inactivo'),
('007', 'STU-404', 'Puertos USB, aire acondicionado', 1, 'Activo'),
('008', 'VWX-505', 'Sistema de sonido envolvente, baño', 2, 'Activo'),
('009', 'YZA-606', 'Asientos reclinables, luces LED', 3, 'Inactivo'),
('010', 'BCD-707', 'Aire acondicionado, soporte para bicicletas', 1, 'Activo'),
('011', 'EFG-808', 'Wi-Fi, tomacorrientes', 2, 'Activo'),
('012', 'HIJ-909', 'Cámaras de seguridad, asientos ergonómicos', 3, 'Inactivo'),
('013', 'KLM-010', 'Baño, Wi-Fi, aire acondicionado', 1, 'Activo');

