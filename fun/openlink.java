class Bruh {

    private void ButtonOpenWebActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            String url = "https://www.youtube.com/watch?v=QceVTChhlJM&ab_channel=TheNotoriousB.I.G.-Topic";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}