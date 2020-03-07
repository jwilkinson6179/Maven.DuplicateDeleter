package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer>
{
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications)
    {
        Integer[] output = new Integer[0];
        for (Integer i = 0; i < array.length; i++)
        {
            Integer currentValue = array[i];
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
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] output = new Integer[0];
        for (Integer i = 0; i < array.length; i++)
        {
            Integer currentValue = array[i];
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

    public Integer[] addToArray(Integer newValue, Integer[] oldArray)
    {
        Integer[] result = new Integer[oldArray.length + 1];

        for(Integer i = 0; i < oldArray.length; i++)
        {
            result[i] = oldArray[i];
        }

        result[result.length - 1] = newValue;

        return result;
    }
}
