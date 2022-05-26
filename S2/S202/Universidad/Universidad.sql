#Si us plau, descàrrega la base de dades del fitxer schema_universidad.sql, visualitza el diagrama E-R en un editor i efectua les següents consultes:

#1 Retorna un llistat amb el primer cognom, segon cognom i el nom de tots els alumnes. El llistat haurà d'estar ordenat alfabèticament de menor a major pel primer cognom, segon cognom i nom.
SELECT apellido1, apellido2, nombre FROM persona WHERE tipo='alumno' ORDER BY apellido1 ASC, apellido2 ASC, nombre ASC;
#2 Esbrina el nom i els dos cognoms dels alumnes que no han donat d'alta el seu número de telèfon en la base de dades.
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo='alumno' AND telefono IS NULL;
#3 Retorna el llistat dels alumnes que van néixer en 1999.
SELECT apellido1, apellido2, nombre FROM persona WHERE YEAR(fecha_nacimiento) = '1999' AND tipo = 'alumno';
#4 Retorna el llistat de professors que no han donat d'alta el seu número de telèfon en la base de dades i a més la seva nif acaba en K.
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo = 'profesor' AND telefono IS NULL AND nif LIKE '%K';
#5 Retorna el llistat de les assignatures que s'imparteixen en el primer quadrimestre, en el tercer curs del grau que té l'identificador 7.
SELECT nombre FROM asignatura WHERE cuatrimestre = 1 AND curso = 3 AND id_grado = 7;
#6 Retorna un llistat dels professors juntament amb el nom del departament al qual estan vinculats. El llistat ha de retornar quatre columnes, primer cognom, segon cognom, nom i nom del departament. El resultat estarà ordenat alfabèticament de menor a major pels cognoms i el nom.
SELECT p.nombre, p.apellido1, p.apellido2, d.nombre FROM (persona p LEFT JOIN profesor m ON p.id = m.id_profesor) LEFT JOIN departamento d ON m.id_departamento = d.id WHERE d.nombre IS NOT NULL ORDER BY p.apellido1 ASC, p.apellido2 ASC, p.nombre ASC;
#7 Retorna un llistat amb el nom de les assignatures, any d'inici i any de fi del curs escolar de l'alumne amb nif 26902806M.
SELECT asignatura.nombre, curso_escolar.anyo_inicio, curso_escolar.anyo_fin
FROM (alumno_se_matricula_asignatura LEFT JOIN asignatura ON alumno_se_matricula_asignatura.id_asignatura=asignatura.id) LEFT JOIN curso_escolar ON alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id WHERE alumno_se_matricula_asignatura.id_alumno = (SELECT id FROM persona WHERE nif LIKE '26902806M');
#8 Retorna un llistat amb el nom de tots els departaments que tenen professors que imparteixen alguna assignatura en el Grau en Enginyeria Informàtica (Pla 2015).
SELECT DISTINCTROW d.nombre FROM departamento d INNER JOIN profesor m ON(d.id = m.id_departamento) INNER JOIN asignatura a ON (m.id_profesor = a.id_profesor) INNER JOIN grado g ON (a.id_grado = g.id) WHERE g.nombre='Grado en Ingeniería Informática (Plan 2015)';
#9 Retorna un llistat amb tots els alumnes que s'han matriculat en alguna assignatura durant el curs escolar 2018/2019
SELECT DISTINCTROW p.nombre, p.apellido1, curso_escolar.anyo_inicio FROM persona p INNER JOIN alumno_se_matricula_asignatura ON (p.id = alumno_se_matricula_asignatura.id_alumno) INNER JOIN curso_escolar ON (alumno_se_matricula_asignatura.id_asignatura = curso_escolar.id) WHERE curso_escolar.anyo_inicio = 2018;

# Resolgui les 6 següents consultes utilitzant les clàusules LEFT JOIN i RIGHT JOIN.

#10 Retorna un llistat amb els noms de tots els professors i els departaments que tenen vinculats. El llistat també ha de mostrar aquells professors que no tenen cap departament associat. El llistat ha de retornar quatre columnes, nom del departament, primer cognom, segon cognom i nom del professor. El resultat estarà ordenat alfabèticament de menor a major pel nom del departament, cognoms i el nom.
SELECT d.nombre, p.apellido1, p.apellido2 , p.nombre, p.tipo  FROM departamento d RIGHT JOIN profesor m ON (m.id_departamento = d.id) RIGHT JOIN persona p ON (m.id_profesor = p.id) WHERE p.tipo = 'profesor' ORDER BY d.nombre ASC, p.apellido1 ASC, p.apellido2 ASC, p.nombre ASC;
#11 Retorna un llistat amb els professors que no estan associats a un departament.
SELECT d.nombre, p.apellido1, p.apellido2 , p.nombre FROM departamento d RIGHT JOIN profesor m ON (m.id_departamento = d.id) RIGHT JOIN persona p ON (m.id_profesor = p.id) WHERE d.id = NULL;
#12 Retorna un llistat amb els departaments que no tenen professors associats.
SELECT d.* FROM departamento d LEFT JOIN profesor m ON (d.id = m.id_departamento) WHERE id_departamento IS NULL;
#13 Retorna un llistat amb els professors que no imparteixen cap assignatura.
SELECT p.nombre, p.apellido1, p.apellido2, asignatura.nombre FROM persona p RIGHT JOIN profesor ON profesor.id_profesor= p.id LEFT JOIN asignatura ON profesor.id_profesor= asignatura.id_profesor WHERE asignatura.id_profesor IS NULL ;
#14 Retorna un llistat amb les assignatures que no tenen un professor assignat.
SELECT a.* FROM asignatura a LEFT JOIN profesor m ON (a.id_profesor = m.id_profesor) WHERE a.id_profesor IS NULL;
#15 Retorna un llistat amb tots els departaments que no han impartit assignatures en cap curs escolar.
SELECT DISTINCT departamento.nombre, asignatura.nombre FROM departamento LEFT JOIN profesor ON departamento.id= profesor.id_departamento LEFT JOIN asignatura ON profesor.id_profesor= asignatura.id_profesor WHERE curso IS NULL;

#Consultes resum:

#16 Retorna el nombre total d'alumnes que hi ha.
SELECT count(*) FROM persona WHERE tipo LIKE 'alumno';
#17 Calcula quants alumnes van néixer en 1999.
SELECT count(*) FROM persona WHERE tipo LIKE 'alumno' AND fecha_nacimiento LIKE '1999%'
#18 Calcula quants professors hi ha en cada departament. El resultat només ha de mostrar dues columnes, una amb el nom del departament i una altra amb el nombre de professors que hi ha en aquest departament. El resultat només ha d'incloure els departaments que tenen professors associats i haurà d'estar ordenat de major a menor pel nombre de professors.
SELECT d.nombre, COUNT(m.id_departamento) AS total_profesores FROM profesor m INNER JOIN departamento d ON (m.id_departamento = d.id) GROUP BY d.nombre ORDER BY total_profesores DESC;
#19 Retorna un llistat amb tots els departaments i el nombre de professors que hi ha en cadascun d'ells. Tingui en compte que poden existir departaments que no tenen professors associats. Aquests departaments també han d'aparèixer en el llistat.
SELECT d.nombre AS nombre_departamento, COUNT(m.id_departamento) AS total_profesores FROM profesor m RIGHT JOIN departamento d ON (m.id_departamento = d.id) GROUP BY d.nombre;
#20 Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun. Tingui en compte que poden existir graus que no tenen assignatures associades. Aquests graus també han d'aparèixer en el llistat. El resultat haurà d'estar ordenat de major a menor pel nombre d'assignatures.
SELECT grado.nombre, COUNT(asignatura.id) AS numero_asignaturas FROM grado LEFT JOIN asignatura ON grado.id = asignatura.id_grado GROUP BY grado.nombre ORDER BY COUNT(*) DESC;
#21 Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun, dels graus que tinguin més de 40 assignatures associades.
SELECT grado.nombre, COUNT(asignatura.id) AS numero_asignaturas FROM grado INNER JOIN asignatura ON grado.id = asignatura.id_grado GROUP BY grado.nombre HAVING COUNT(asignatura.id)>40;
#22 Retorna un llistat que mostri el nom dels graus i la suma del nombre total de crèdits que hi ha per a cada tipus d'assignatura. El resultat ha de tenir tres columnes: nom del grau, tipus d'assignatura i la suma dels crèdits de totes les assignatures que hi ha d'aquest tipus.
SELECT g.nombre AS nombre_grado, a.tipo AS tipo_asignatura, SUM(a.creditos) AS total_creditos FROM asignatura a RIGHT JOIN grado g ON(a.id_grado = g.id) GROUP BY a.tipo, g.nombre ORDER BY total_creditos DESC;
#23 Retorna un llistat que mostri quants alumnes s'han matriculat d'alguna assignatura en cadascun dels cursos escolars. El resultat haurà de mostrar dues columnes, una columna amb l'any d'inici del curs escolar i una altra amb el nombre d'alumnes matriculats.
SELECT curso_escolar.anyo_inicio, COUNT(alumno_se_matricula_asignatura.id_alumno) AS numero_de_matriculados FROM curso_escolar LEFT JOIN alumno_se_matricula_asignatura ON curso_escolar.id = alumno_se_matricula_asignatura.id_curso_escolar GROUP BY anyo_inicio;
#24 Retorna un llistat amb el nombre d'assignatures que imparteix cada professor. El llistat ha de tenir en compte aquells professors que no imparteixen cap assignatura. El resultat mostrarà cinc columnes: id, nom, primer cognom, segon cognom i nombre d'assignatures. El resultat estarà ordenat de major a menor pel nombre d'assignatures.
SELECT p.id, p.nombre, p.apellido1, p.apellido2, COUNT(a.id_profesor) AS cant_asignaturas FROM (persona p RIGHT JOIN profesor m ON p.id = m.id_profesor) LEFT JOIN asignatura a ON (m.id_profesor = a.id_profesor) GROUP BY p.id ORDER BY cant_asignaturas DESC;
#25 Retorna totes les dades de l'alumne més jove.
SELECT * FROM persona p WHERE tipo='alumno' ORDER BY p.fecha_nacimiento DESC LIMIT 1;
#26 Retorna un llistat amb els professors que tenen un departament associat i que no imparteixen cap assignatura.
SELECT  p.nombre, p.apellido1, p.apellido2 FROM persona p LEFT JOIN profesor m ON (p.id = m.id_profesor) LEFT JOIN asignatura a ON(m.id_profesor = a.id_profesor) WHERE p.tipo = 'profesor' AND a.nombre IS NULL;