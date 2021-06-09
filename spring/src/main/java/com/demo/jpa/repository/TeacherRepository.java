package com.demo.jpa.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.jpa.entity.Teacher;
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
	//@Query("select  COUNT ( t.name ) AS Count , t.name as TeacherName , c.name as CourseName , d.name as DepartmentName from Teacher t inner join fetch t.department d inner join fetch d.course c group by t.name,c.name,d.name")
   //	List<Object[]> getDetails();
	
	@Query("select new map(count(t) as count, t.name as teacherName,t.department.name as department,c.name as course ) from Teacher t JOIN t.courses c group by t.name,t.department.name, c.name order by t.name,c.name ")
	public List<?> teachersCollection();
	
	@Query("select new map(count(t) as count, t.name as teacherName,t.department.name as department ) from Teacher t JOIN t.courses c group by t.name,t.department.name order by t.name ")
	public List<?> teachersCollectionbydepart();
}
