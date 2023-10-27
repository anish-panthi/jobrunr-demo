//package dev.app.jobrunner.singleentity4multipletables;
//
//import jakarta.persistence.EntityManager;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * @author Anish Panthi
// */
//@Service
//@Log4j2
//@RequiredArgsConstructor
//public class TableService {
//
//    private final TableRepository tableRepository;
//
//    private final EntityManager entityManager;
//
//    @Transactional
//    public void saveToTable(String tableName, TableA entity) {
//        log.info("Saving entity to table: {}", tableName);
//
//        String insertQuery = "INSERT INTO TMV." + tableName + " (FIRST_NAME, LAST_NAME) VALUES (:property2, :property3)";
//
//        entityManager.createNativeQuery(insertQuery)
//                .setParameter("property2", entity.getFirstName())
//                .setParameter("property3", entity.getLastName())
//                .executeUpdate();
//    }
//}
