import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<String>();

    public UrlLibrary() {
        urls.add("http://jaworznotomy.pl/");
        //urls.add("https://www.facebook.com/annamariakayle/");
        urls.add("http://caveofprogramming.com/");
    }

    private class UrlIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(urls.get(index));
                
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                

                String line = null;

                while((line=br.readLine())!=null){
                    sb.append(line);
                    sb.append("\n");
                }
                br.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
            

            index++;

            return sb.toString();
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            urls.remove(index);
        }

    }


    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

}