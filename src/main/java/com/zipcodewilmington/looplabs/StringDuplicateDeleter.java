package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray)
    {
        super(intArray);
//        array = new String[intArray.length];
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications)
    {
        String[] output = new String[0];
        for (Integer i = 0; i < array.length; i++)
        {
            String currentValue = array[i];
            Integer occurrencesOfValue = 0;

            for (Integer k = 0; k < array.length; k++)
            {
                if (array[i].equals(array[k]))
                {
                    occurrencesOfValue++;
                }
            }
            if (occurrencesOfValue < maxNumberOfDuplications)
            {
                output = addToArray(currentValue, output);
            }
        }

        return output;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] output = new String[0];
        for (Integer i = 0; i < array.length; i++)
        {
            String currentValue = array[i];
            Integer occurrencesOfValue = 0;

            for (Integer k = 0; k < array.length; k++)
            {
                if (array[i].equals(array[k]))
                {
                    occurrencesOfValue++;
                }
            }
            if (!occurrencesOfValue.equals(exactNumberOfDuplications))
            {
                output = addToArray(currentValue, output);
            }
        }

        return output;
    }

    public String[] addToArray(String newValue, String[] oldArray)
    {
        String[] result = new String[oldArray.length + 1];

        for(Integer i = 0; i < oldArray.length; i++)
        {
            result[i] = oldArray[i];
        }

        result[result.length - 1] = newValue;

        return result;
    }
}
