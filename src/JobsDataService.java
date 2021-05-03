import java.util.*;
import java.util.stream.Collectors;

public class JobsDataService {
            public void FilterJobsByTitle(List <JobDetails> jobs) {
                // output the list of Job Titles and Job popularity(i.e. frequency of job titles) in the console.
                Map<String, Integer> jobFrequencyMap = new HashMap<>();

                Iterator<JobDetails> jobsIterator = jobs.iterator();
                while (jobsIterator.hasNext()) {
                    JobDetails job = jobsIterator.next();
                    String title = job.getTitle();

                    if (jobFrequencyMap.containsKey(title)) {
                        int value = jobFrequencyMap.get(title);
                        jobFrequencyMap.remove(title);
                        value++;
                        jobFrequencyMap.put(title, value);
                    } else {
                        jobFrequencyMap.put(title, 1);
                    }
                }

                System.out.println("the list of Job Titles and Job popularity(i.e. frequency of job titles):");

                Set<Map.Entry<String, Integer>> jobFrequencyMapEntries = jobFrequencyMap.entrySet();
                Iterator<Map.Entry<String, Integer>> jobFrequencyMapIterator = jobFrequencyMapEntries.iterator();
                int j=0;
                while (jobFrequencyMapIterator.hasNext()) {
                    Map.Entry<String, Integer> entry = jobFrequencyMapIterator.next();
                    j++;
                    System.out.print(j);
                    System.out.print(String.format("\tJob Title:%-50s\thas popularity of ",entry.getKey()));
                    System.out.println(entry.getValue()+" jobs");
                }

           //Or using for loop
                /*
                int j=0;
                for (String name: jobFrequencyMap.keySet()) {
                    String key = name.toString();
                    String value = jobFrequencyMap.get(name).toString();
=                    j++;
                    System.out.print(j);
                    System.out.print(String.format("\tJob Title:%-50s\thas popularity of ",name));
                    System.out.println(jobFrequencyMap.get(name)+" jobs");
                }
                */
            }

            public void FilterJobsByCountry(List <JobDetails> jobs){
                //output the list of Country and Job demand (i.e. frequency of jobs related to country) in the console.
                Map<String, Integer> jobFrequencyMap = new HashMap<>();

                Iterator<JobDetails> jobsIterator = jobs.iterator();
                while (jobsIterator.hasNext()) {
                    JobDetails job = jobsIterator.next();
                    String country = job.getCountry();

                    if (jobFrequencyMap.containsKey(country)) {
                        int value = jobFrequencyMap.get(country);
                        jobFrequencyMap.remove(country);
                        value++;
                        jobFrequencyMap.put(country, value);
                    } else {
                        jobFrequencyMap.put(country, 1);
                    }
                }

                System.out.println("the list of Country and Job demand (i.e. frequency of jobs related to country):");

                Set<Map.Entry<String, Integer>> jobFrequencyMapEntries = jobFrequencyMap.entrySet();
                Iterator<Map.Entry<String, Integer>> jobFrequencyMapIterator = jobFrequencyMapEntries.iterator();
                int j=0;
                while (jobFrequencyMapIterator.hasNext()) {
                    Map.Entry<String, Integer> entry = jobFrequencyMapIterator.next();
                    j++;
                    System.out.print(j);
                    System.out.print(String.format("\t%-20s\thas a job frequency of ",entry.getKey()));
                    System.out.println(entry.getValue()+" jobs");
                }

                //Or using for loop
                /*
                int j=0;
                for (String name: jobFrequencyMap.keySet()) {
                    String key = name.toString();
                    String value = jobFrequencyMap.get(name).toString();
                    j++;
                    System.out.print(j);
                    System.out.print(String.format("\t%-20s\thas a job frequency of ",name));
                    System.out.println(jobFrequencyMap.get(name)+" jobs");
                }
*/

            }

            public Map<String, Integer> FilterJobsByLevel(List <JobDetails> jobs) {
                //output the list of Level and popularity(i.e. frequency of job Level) in the console.
                Map<String, Integer> jobFrequencyMap = new HashMap<>();

                Iterator<JobDetails> jobsIterator = jobs.iterator();
                while (jobsIterator.hasNext()) {
                    JobDetails job = jobsIterator.next();
                    String level = job.getLevel();

                    if (jobFrequencyMap.containsKey(level)) {
                        int value = jobFrequencyMap.get(level);
                        jobFrequencyMap.remove(level);
                        value++;
                        jobFrequencyMap.put(level, value);
                    } else {
                        jobFrequencyMap.put(level, 1);
                    }
                }

                System.out.println("the list of Level and popularity(i.e. frequency of job Level):");

                Set<Map.Entry<String, Integer>> jobFrequencyMapEntries = jobFrequencyMap.entrySet();
                Iterator<Map.Entry<String, Integer>> jobFrequencyMapIterator = jobFrequencyMapEntries.iterator();
                int j=0;
                while (jobFrequencyMapIterator.hasNext()) {
                    Map.Entry<String, Integer> entry = jobFrequencyMapIterator.next();
                    j++;
                    System.out.print(j);
                    System.out.print(String.format("\tLevel: %-20s\thas popularity of ",entry.getKey()));
                    System.out.println(entry.getValue()+" jobs");
                }

                //Or using for loop
               /*
                int j=0;
                for (String name: jobFrequencyMap.keySet()) {
                    String key = name.toString();
                    String value = jobFrequencyMap.get(name).toString();
                    j++;
                    System.out.print(j);
                    System.out.print(String.format("\tLevel: %-20s\thas popularity of ",name));
                    System.out.println(jobFrequencyMap.get(name)+" jobs");
                }
*/
                return jobFrequencyMap;
            }

            public LinkedHashMap<String, Integer> sortMap(Map<String, Integer> map) {
                //Returns the ascending sorted map by its value of the Map given as an argument.
                LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (a, b) -> { throw new AssertionError(); },
                                LinkedHashMap::new
                        ));
                return sortedMap;

            }

            public void FilterJobsByYearsExp(List <JobDetails> jobs) {
                // output the a sorted list of YearsExp and popularity(i.e. frequency of job YearsExp) in the console using sortMap function.
                Map<String, Integer> jobFrequencyMap = new HashMap<>();

                Iterator<JobDetails> jobsIterator = jobs.iterator();
                while (jobsIterator.hasNext()) {
                    JobDetails job = jobsIterator.next();
                    String yearsOfEx = job.getYearsExp();

                    if (jobFrequencyMap.containsKey(yearsOfEx)) {
                        int value = jobFrequencyMap.get(yearsOfEx);
                        jobFrequencyMap.remove(yearsOfEx);
                        value++;
                        jobFrequencyMap.put(yearsOfEx, value);
                    } else {
                        jobFrequencyMap.put(yearsOfEx, 1);
                    }
                }

                LinkedHashMap<String, Integer> sortedMap = sortMap(jobFrequencyMap);
                System.out.println("the a sorted list of YearsExp and popularity(i.e. frequency of job YearsExp):");

                Set<Map.Entry<String, Integer>> jobFrequencyMapEntries = sortedMap.entrySet();
                Iterator<Map.Entry<String, Integer>> jobFrequencyMapIterator = jobFrequencyMapEntries.iterator();
                while (jobFrequencyMapIterator.hasNext()) {
                    Map.Entry<String, Integer> entry = jobFrequencyMapIterator.next();
                    System.out.print(String.format("%-20s\thas popularity of ",entry.getKey()));
                    System.out.println(entry.getValue()+" jobs");
                }
                //Or using for loop
                /*
                for (String name: jobFrequencyMap.keySet()) {
                    String key = name.toString();
                    String value = jobFrequencyMap.get(name).toString();
                    System.out.print(String.format("%-20s\thas popularity of ",name));
                    System.out.println(jobFrequencyMap.get(name)+" jobs");
                }
                 */
            }
}
