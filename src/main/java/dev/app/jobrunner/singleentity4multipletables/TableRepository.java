//package dev.app.jobrunner.singleentity4multipletables;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.transaction.annotation.Transactional;
//
//public interface TableRepository extends JpaRepository<TableA, Long> {
//
////    @Modifying
////    @Transactional
////    @Query(value = "INSERT INTO "+":tableName"+" (ID,FIRST_NAME,LAST_NAME) VALUES (:#{#entity.id},:#{#entity.firstName},:#{#entity.lastName})", nativeQuery = true)
////    void saveToTable(String tableName, TableA entity);
//}
