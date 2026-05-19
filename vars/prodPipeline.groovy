def call() {
    echo 'Running Prod Pipeline...'
    sh '''
        cd /home/kaaba/mlops_assignment
        /home/kaaba/mlops_assignment/venv/bin/python train.py
    '''
    echo 'Prod Pipeline completed. Alias: Champion.'
}
