INSERT INTO usuario (login, senha, nome, email)
SELECT * FROM (SELECT 'admin', '$2a$10$r0RFDmpneBVryx.ihHK9gu6FFJQi4nTxQUqzdSTvrPpaKZMxigqpy', 'Administrador da Silva', 'admin@admin.com') AS tmp
WHERE NOT EXISTS (
    SELECT login FROM usuario WHERE login = 'admin'
) LIMIT 1;