package com.company.MicaelaPerez.service;

import com.company.MicaelaPerez.models.DriveDocument;

import java.util.ArrayList;
import java.util.List;

public class GoogleDriveProxy implements IAccesDocument {
        // Instanciamos un googleDrive dentro del proxy para poder utilizar sus metodos
        private GoogleDrive googleDrive = new GoogleDrive();
        // Creamos una lista que va a almacenar el registro de acceso a los documentos
        private List<String> documentAccessRegister = new ArrayList<>();

        @Override
        public String accessDocument(String url, String email) {
            List<DriveDocument> foundDocumentList = googleDrive.findDocument(url);
            documentAccessRegister.add("documento con id "
                    +  foundDocumentList.get(0).getId()
                    + " fue accedido por usuario con email " + email);
            String accessMsj = googleDrive.accessDocument(url, email);
            System.out.println(accessMsj);
            return accessMsj;
        }

        public void addDocument(DriveDocument document) {
            googleDrive.addDocument(document);
        }

        public List<String> getDocumentAccessRegister() {
            return documentAccessRegister;
        }
    }
