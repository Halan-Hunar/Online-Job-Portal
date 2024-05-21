package idea.project ;
  
    import java.util.ArrayList ;
    import java.util.Date ;
    import java.util.List ; 


public class FeedbackSystem {
    
    private int feedbackId ;
    private String username ;
    private String feedbackMessage ;
    private Date feedbackDate ;
    private List<Feedback> feedbackList ;
    
    
    public FeedbackSystem(){
        
        this.feedbackId = 0 ;
        this.username = "" ;
        this.feedbackMessage = "" ;
        this.feedbackDate = new Date();
        this.feedbackList = new ArrayList<>();
    }
        private class Feedback {
            
            private int feedbackId ;
            private String username ;
            private String feedbackMessage ;
            private Date feedbackDate ;
            
            public Feedback(int feedbackId , String username , String feedbackMessage, Date feedbackDate){
                
                this.feedbackId = feedbackId ;
                this.username = username ;
                this.feedbackMessage = feedbackMessage ;
                this.feedbackDate = feedbackDate ; 
            }
            
            public int getFeedbackId(){
                return feedbackId ; 
            }
            
            public String getUsername(){
                return username ;
            }
           
            public String getFeedbackMessage(){
                return feedbackMessage ;
            }
            
            public Date getFeedbackDate(){
                return feedbackDate ;
            }
           
               public String toString() {
                   
            return "Feedback{" +
            "feedbackId=" + feedbackId +
            ", username='" + username + '\'' +
            ", feedbackMessage='" + feedbackMessage + '\'' +
            ", feedbackDate=" + feedbackDate +
            '}';
                }
            } 
        
        public boolean submitFeedback( String username , String feedbackMessage){
            
            this.feedbackId++ ;
            Feedback newFeedback = new Feedback (this.feedbackId,username , feedbackMessage, new Date());
            this.feedbackList.add(newFeedback);
            System.out.println("Feedback submitted successfully");
            return true ;
            }
        
        public List<Feedback> viewFeedback(String username) {
            List<Feedback> userFeedback = new ArrayList<>();
            for(Feedback feedback : feedbackList) {
                if(feedback.getUsername().equals(username)) {
                    userFeedback.add(feedback);
                }
            }
            return userFeedback ; 
        
        }
         public boolean deleteFeedback(int feedbackId) {
             for (Feedback feedback : feedbackList){
                 if (feedback.getFeedbackId() == feedbackId) {
                     feedbackList.remove(feedback);
                     System.out.println("Feedback deleted successfully");
                     return true ;
                 }
             }
             System.out.println("Feedback with ID " + feedbackId + " does not exist");
             return false ;
         }
         
         public void displayAllFeedback() {
             for (Feedback feedback : feedbackList) {
                 System.out.println(feedback);
             }
         }
    }
    
   
